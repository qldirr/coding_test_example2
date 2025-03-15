package com.example.todo;

public class StarPatterns {
    public static void main(String[] args) {
        int rows = 5; // 원하는 크기 설정

        triangle(rows);
        reverseTriangle(rows);
        rightAlignedTriangle(rows);
        reverseRightAlignedTriangle(rows);
        pyramid(rows);
        reversePyramid(rows);
        diamond(rows);
        hollowSquare(rows);
        hollowTriangle(rows);
        hourglass(rows);
        numberPyramid(rows);
        pascalTriangle(rows);
        zPattern(rows);
        xPattern(rows);
        butterflyPattern(rows);
    }

    // 1. 기본 직각삼각형
    public static void triangle(int n) {
        System.out.println("1. 기본 직각삼각형");
        String result = "";
        for (int i = 1; i <= n; i++) {
            String stars = "";
            for (int j = 1; j <= i; j++) {
                stars += "* ";
            }
            result += stars + "\n";
            System.out.println(stars);
        }
        System.out.println("\n");
    }
    /* 예시 출력 (n=5):
     *
     * *
     * * *
     * * * *
     * * * * *
     */

    // 2. 역직각삼각형
    public static void reverseTriangle(int n) {
        System.out.println("2. 역직각삼각형");
        String result = "";
        for (int i = n; i >= 1; i--) {
            String stars = "";
            for (int j = 1; j <= i; j++) {
                stars += "* ";
            }
            result += stars + "\n";
            System.out.println(stars);
        }
        System.out.println("\n");
    }
    /* 예시 출력 (n=5):
     * * * * *
     * * * *
     * * *
     * *
     *
     */

    // 3. 우측 정렬된 직각삼각형
    public static void rightAlignedTriangle(int n) {
        System.out.println("3. 우측 정렬된 직각삼각형");
        String result = "";
        for (int i = 1; i <= n; i++) {
            String stars = "";
            // 공백 추가
            for (int j = 1; j <= n - i; j++) {
                stars += "  ";
            }
            // 별 추가
            for (int j = 1; j <= i; j++) {
                stars += "* ";
            }
            result += stars + "\n";
            System.out.println(stars);
        }
        System.out.println("\n");
    }
    /* 예시 출력 (n=5):
     *
     * *
     * * *
     * * * *
     * * * * *
     */

    // 4. 우측 정렬된 역직각삼각형
    public static void reverseRightAlignedTriangle(int n) {
        System.out.println("4. 우측 정렬된 역직각삼각형");
        String result = "";
        for (int i = n; i >= 1; i--) {
            String stars = "";
            // 공백 추가
            for (int j = 1; j <= n - i; j++) {
                stars += "  ";
            }
            // 별 추가
            for (int j = 1; j <= i; j++) {
                stars += "* ";
            }
            result += stars + "\n";
            System.out.println(stars);
        }
        System.out.println("\n");
    }
    /* 예시 출력 (n=5):
     * * * * *
     * * * *
     * * *
     * *
     *
     */

    // 5. 피라미드
    public static void pyramid(int n) {
        System.out.println("5. 피라미드");
        String result = "";
        for (int i = 1; i <= n; i++) {
            String stars = "";
            // 공백 추가
            for (int j = 1; j <= n - i; j++) {
                stars += " ";
            }
            // 별 추가
            for (int j = 1; j <= 2 * i - 1; j++) {
                stars += "*";
            }
            result += stars + "\n";
            System.out.println(stars);
        }
        System.out.println("\n");
    }
    /* 예시 출력 (n=5):
     *
     ***
     *****
     *******
     *********
     */

    // 6. 역피라미드
    public static void reversePyramid(int n) {
        System.out.println("6. 역피라미드");
        String result = "";
        for (int i = n; i >= 1; i--) {
            String stars = "";
            // 공백 추가
            for (int j = 1; j <= n - i; j++) {
                stars += " ";
            }
            // 별 추가
            for (int j = 1; j <= 2 * i - 1; j++) {
                stars += "*";
            }
            result += stars + "\n";
            System.out.println(stars);
        }
        System.out.println("\n");
    }
    /* 예시 출력 (n=5):
     *********
     *******
     *****
     ***
     *
     */

    // 7. 다이아몬드
    public static void diamond(int n) {
        System.out.println("7. 다이아몬드");
        String result = "";
        // 상단부 (피라미드)
        for (int i = 1; i <= n; i++) {
            String stars = "";
            // 공백 추가
            for (int j = 1; j <= n - i; j++) {
                stars += " ";
            }
            // 별 추가
            for (int j = 1; j <= 2 * i - 1; j++) {
                stars += "*";
            }
            result += stars + "\n";
            System.out.println(stars);
        }

        // 하단부 (역피라미드, 첫 행 제외)
        for (int i = n - 1; i >= 1; i--) {
            String stars = "";
            // 공백 추가
            for (int j = 1; j <= n - i; j++) {
                stars += " ";
            }
            // 별 추가
            for (int j = 1; j <= 2 * i - 1; j++) {
                stars += "*";
            }
            result += stars + "\n";
            System.out.println(stars);
        }
        System.out.println("\n");
    }
    /* 예시 출력 (n=5):
     *
     ***
     *****
     *******
     *********
     *******
     *****
     ***
     *
     */

    // 8. 속이 빈 사각형
    public static void hollowSquare(int n) {
        System.out.println("8. 속이 빈 사각형");
        String result = "";
        for (int i = 1; i <= n; i++) {
            String stars = "";
            for (int j = 1; j <= n; j++) {
                // 첫 행, 마지막 행, 첫 열, 마지막 열에만 별 출력
                if (i == 1 || i == n || j == 1 || j == n) {
                    stars += "* ";
                } else {
                    stars += "  "; // 두 칸 공백 (별 하나와 공백 하나의 크기에 맞춤)
                }
            }
            result += stars + "\n";
            System.out.println(stars);
        }
        System.out.println("\n");
    }
    /* 예시 출력 (n=5):
     * * * * *
     *       *
     *       *
     *       *
     * * * * *
     */

    // 9. 속이 빈 삼각형
    public static void hollowTriangle(int n) {
        System.out.println("9. 속이 빈 삼각형");
        String result = "";
        for (int i = 1; i <= n; i++) {
            String stars = "";
            for (int j = 1; j <= i; j++) {
                // 첫 행, 마지막 행, 왼쪽 대각선, 오른쪽 대각선에만 별 출력
                if (i == n || j == 1 || j == i) {
                    stars += "* ";
                } else {
                    stars += "  "; // 두 칸 공백
                }
            }
            result += stars + "\n";
            System.out.println(stars);
        }
        System.out.println("\n");
    }
    /* 예시 출력 (n=5):
     *
     * *
     *   *
     *     *
     * * * * *
     */

    // 10. 모래시계
    public static void hourglass(int n) {
        System.out.println("10. 모래시계");
        String result = "";
        // 상단부 (역피라미드)
        for (int i = n; i >= 1; i--) {
            String stars = "";
            // 공백 추가
            for (int j = 1; j <= n - i; j++) {
                stars += " ";
            }
            // 별 추가
            for (int j = 1; j <= 2 * i - 1; j++) {
                stars += "*";
            }
            result += stars + "\n";
            System.out.println(stars);
        }

        // 하단부 (피라미드, 첫 행 제외)
        for (int i = 2; i <= n; i++) {
            String stars = "";
            // 공백 추가
            for (int j = 1; j <= n - i; j++) {
                stars += " ";
            }
            // 별 추가
            for (int j = 1; j <= 2 * i - 1; j++) {
                stars += "*";
            }
            result += stars + "\n";
            System.out.println(stars);
        }
        System.out.println("\n");
    }
    /* 예시 출력 (n=5):
     *********
     *******
     *****
     ***
     *
     ***
     *****
     *******
     *********
     */

    // 11. 숫자 피라미드
    public static void numberPyramid(int n) {
        System.out.println("11. 숫자 피라미드");
        String result = "";
        for (int i = 1; i <= n; i++) {
            String pattern = "";
            // 공백 추가
            for (int j = 1; j <= n - i; j++) {
                pattern += " ";
            }
            // 숫자 추가
            for (int j = 1; j <= i; j++) {
                pattern += j;
            }
            // 역순 숫자 추가 (첫 번째 숫자 제외)
            for (int j = i - 1; j >= 1; j--) {
                pattern += j;
            }
            result += pattern + "\n";
            System.out.println(pattern);
        }
        System.out.println("\n");
    }
    /* 예시 출력 (n=5):
        1
       121
      12321
     1234321
    123454321
    */

    // 12. 패스칼의 삼각형
    public static void pascalTriangle(int n) {
        System.out.println("12. 패스칼의 삼각형");
        String result = "";

        // 각 행마다 계산 결과를 저장 (동적 프로그래밍 방식)
        int[][] pascalArr = new int[n][n];

        for (int i = 0; i < n; i++) {
            String line = "";

            // 공백 추가
            for (int space = 0; space < n - i; space++) {
                line += " ";
            }

            // 숫자 계산 및 추가
            for (int j = 0; j <= i; j++) {
                // 첫 번째와 마지막 요소는 1
                if (j == 0 || j == i) {
                    pascalArr[i][j] = 1;
                } else {
                    // 그 외의 요소는 위쪽 두 요소의 합
                    pascalArr[i][j] = pascalArr[i - 1][j - 1] + pascalArr[i - 1][j];
                }
                line += pascalArr[i][j] + " ";
            }

            result += line + "\n";
            System.out.println(line);
        }
        System.out.println("\n");
    }
    /* 예시 출력 (n=5):
         1
        1 1
       1 2 1
      1 3 3 1
     1 4 6 4 1
    */

    // 13. Z 패턴
    public static void zPattern(int n) {
        System.out.println("13. Z 패턴");
        String result = "";

        for (int i = 1; i <= n; i++) {
            String line = "";
            for (int j = 1; j <= n; j++) {
                // 첫 행, 마지막 행, 또는 대각선 위치에만 별 출력
                if (i == 1 || i == n || i + j == n + 1) {
                    line += "* ";
                } else {
                    line += "  ";
                }
            }
            result += line + "\n";
            System.out.println(line);
        }
        System.out.println("\n");
    }
    /* 예시 출력 (n=5):
     * * * * *
     *
     *
     *
     * * * * *
     */

    // 14. X 패턴
    public static void xPattern(int n) {
        System.out.println("14. X 패턴");
        String result = "";

        for (int i = 1; i <= n; i++) {
            String line = "";
            for (int j = 1; j <= n; j++) {
                // 두 대각선 위치에만 별 출력
                if (i == j || i + j == n + 1) {
                    line += "* ";
                } else {
                    line += "  ";
                }
            }
        }
    }
    /* 예시 출력 (n=5):
     *       *
     *   *
     *
     *   *
     *       *
     */

    // 15. 나비 패턴
    public static void butterflyPattern(int n) {
        System.out.println("15. 나비 패턴");
        String result = "";

        // 상단 부분
        for (int i = 1; i <= n; i++) {
            String line = "";
            // 왼쪽 별
            for (int j = 1; j <= i; j++) {
                line += "* ";
            }
            // 중앙 공백
            for (int j = 1; j <= 2 * (n - i); j++) {
                line += "  ";
            }
            // 오른쪽 별
            for (int j = 1; j <= i; j++) {
                line += "* ";
            }
            result += line + "\n";
            System.out.println(line);
        }

        // 하단 부분
        for (int i = n - 1; i >= 1; i--) {
            String line = "";
            // 왼쪽 별
            for (int j = 1; j <= i; j++) {
                line += "* ";
            }
            // 중앙 공백
            for (int j = 1; j <= 2 * (n - i); j++) {
                line += "  ";
            }
            // 오른쪽 별
            for (int j = 1; j <= i; j++) {
                line += "* ";
            }
            result += line + "\n";
            System.out.println(line);
        }
        System.out.println("\n");
    }
    /* 예시 출력 (n=5):
     *                 *
     * *             * *
     * * *         * * *
     * * * *     * * * *
     * * * * * * * * * *
     * * * *     * * * *
     * * *         * * *
     * *             * *
     *                 *
     */
}


