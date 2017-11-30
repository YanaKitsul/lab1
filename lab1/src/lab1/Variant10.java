package lab1;

public class Variant10 {


	public class Addition{
		int field1;
		int field2;
		int field3;
		int field4;
	
	
	@Override
	public String toString() {
		return "Addition [field1=" + field1 + ", field2=" + field2 +  "field3=" + field3 + ", field4=" + field4 + "]";
	}
	
	public Addition()
	{
		field1 = 0;
		field2 = 0;
	}
	
	public Addition(int x1, int x2, int x3, int x4)
	{
		field1 = x1;
		field2 = x2;
		field3 = x3;
		field4 = x4;
	}

	}
	
    public static double Begin16(double x1, double x2) {
        return Math.abs(x1 - x2);
    }

    public static int Integer16(int k) {
        assert (k > 100 && k < 999) : "k > 100 && k < 999";

        int un = k % 10;
        int doz = k % 100;
        k -= doz;
        doz -= un;
        un *= 10;
        doz /= 10;
        k = k + doz + un;

        return k;
    }

    public boolean Boolean16(int k) {
        return ((k >= 10) && (k <= 99) && (k % 2 == 0));
    }

    public static void If16(double a, double b, double c) {
        if (a <= b && b <= c) {
            a *= 2;
            b *= 2;
            c *= 2;
        } else {
            a *= -1;
            b *= -1;
            c *= -1;
        }
    }

    public static void For16(double A, int N) {

        double pow = 1;
        for (int i = 1; i <= N; i++) {
            pow = pow * A;
            System.out.println(A + "^" + i + " = " + pow);
        }

    }

    public static void While16(double P) {
        double s = 10, norm = 10;
        int k = 1;

        while (s <= 200) {
            norm += (norm / 100 * P); //збільшуємо довж пробігу на Р%
            s += norm;
            k++;
        }
        System.out.println("Кількість днів = " + k);
        System.out.println("Сумарний пробіг = " + s);
    }

    public static int Array33(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length - 1; i++) {
            if ((arr[i] >= arr[i - 1]) && (arr[i] >= arr[i + 1]) && arr[i] > max) {
                max = arr[i];
            }
        }

        if (arr[arr.length - 1] > max)
            max = arr[arr.length - 1];
        return max;
    }

    public static void Matrix62(int[][] arr, int k) {
        int[][] res = new int[arr.length][arr[0].length - 1];

        int inc = 0;
        for (int i = 0; i < arr.length; i++) {
            inc = 0;
            for (int j = 0; j < arr[0].length - 1; j++) {
                if (j == k) {
                    inc++;
                }

                res[i][j] = arr[i][j + inc];
                System.out.print(res[i][j]);
            }
            System.out.println();
        }

    }

    public static void Case16(int year) {

        if (year > 20 && year < 69) {

            int num = year - (year % 10);
            switch (num) {
                case 20:
                    System.out.print("Двадцять ");
                    break;
                case 30:
                    System.out.print("Тридцять ");
                    break;
                case 40:
                    System.out.print("Сорок ");
                    break;
                case 50:
                    System.out.print("П'ятдесят ");
                    break;
                case 60:
                    System.out.print("Шістдесят ");
                    break;
            }
            num = year % 10;
            switch (num) {
                case 0:
                    System.out.println("років");
                    break;
                case 1:
                    System.out.println("один рік");
                    break;
                case 2:
                    System.out.println("два роки");
                    break;
                case 3:
                    System.out.println("три роки");
                    break;
                case 4:
                    System.out.println("чотири роки");
                    break;
                case 5:
                    System.out.println("п'ять років");
                    break;
                case 6:
                    System.out.println("шість років");
                    break;
                case 7:
                    System.out.println("сім років");
                    break;
                case 8:
                    System.out.println("вісім років");
                    break;
                case 9:
                    System.out.println("дев'ять років");
                    break;
            }
        } else {
            System.out.println("ERROR");
        }


    }

    public static void main(String[] args) {

    }
}