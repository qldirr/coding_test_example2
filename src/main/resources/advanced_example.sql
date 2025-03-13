--테이블명: Orders, Customers, Products
CREATE TABLE Customers (
    customer_id INT PRIMARY KEY,
    name VARCHAR(100),
    email VARCHAR(100),
    created_at DATE
);

CREATE TABLE Products (
    product_id INT PRIMARY KEY,
    name VARCHAR(100),
    price DECIMAL(10, 2),
    category VARCHAR(50)
);

CREATE TABLE Orders (
    order_id INT PRIMARY KEY,
    customer_id INT,
    product_id INT,
    order_date DATE,
    quantity INT,
    status VARCHAR(20),
    FOREIGN KEY (customer_id) REFERENCES Customers(customer_id),
    FOREIGN KEY (product_id) REFERENCES Products(product_id)
);


--다음 조건을 만족하는 주문 목록을 조회하는 SQL을 작성하시오.
--
--주문 상태가 "Completed"인 주문만 조회
--주문일이 지난 6개월 이내인 주문만 조회
--고객 이메일이 "@example.com"으로 끝나는 경우만 조회
--주문한 상품의 카테고리가 "Electronics"이면서 가격이 100달러 이상인 경우만 조회
--주문 수량이 2개 이상인 경우만 조회
--결과는 주문일이 가장 최근인 순서로 정렬
SELECT o.order_id,
       c.name AS customer_name,
       c.email AS customer_email,
       p.name AS product_name,
       p.price,
       o.quantity,
       o.order_date,
       o.status
FROM Orders o
JOIN Customers c ON o.customer_id = c.customer_id
JOIN Products p ON o.product_id = p.product_id
WHERE o.status = 'Completed'
  AND o.order_date >= DATE_SUB(CURDATE(), INTERVAL 6 MONTH)
  AND c.email LIKE '%@example.com'
  AND p.category = 'Electronics'
  AND p.price >= 100
  AND o.quantity >= 2
ORDER BY o.order_date DESC;


--다음 조건을 만족하는 결과를 GROUP BY와 함께 작성하시오.
--
--고객별 총 주문 금액(Total Amount) 및 평균 주문 금액(Average Amount) 출력
--주문 상태가 "Completed"인 주문만 포함
--주문일이 지난 1년 이내의 주문만 포함
--총 주문 금액이 1000달러 이상인 고객만 출력
--결과는 총 주문 금액이 높은 순으로 정렬
SELECT
    c.customer_id,
    c.name AS customer_name,
    SUM(p.price * o.quantity) AS total_amount,
    AVG(p.price * o.quantity) AS average_amount,
    COUNT(o.order_id) AS total_orders
FROM Orders o
JOIN Customers c ON o.customer_id = c.customer_id
JOIN Products p ON o.product_id = p.product_id
WHERE o.status = 'Completed'
  AND o.order_date >= DATE_SUB(CURDATE(), INTERVAL 1 YEAR)
GROUP BY c.customer_id, c.name
HAVING SUM(p.price * o.quantity) >= 1000
ORDER BY total_amount DESC;
