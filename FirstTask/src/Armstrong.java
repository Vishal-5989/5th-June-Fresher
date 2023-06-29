 class Armstrong {

    static int armstrongNo(int n) {
        int temp, count = 0, last = 0, sum = 0;
        temp = n;

        while (temp > 0) {
            temp = temp / 10;
            count++;
        }
        temp = n;
        while (temp > 0) {
            last = temp % 10;
            sum += Math.pow(last, count);
            temp = temp / 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("Armstrong series are :");
        for (int i = 2; i <= 1000; i++) {

            int res = armstrongNo(i);
            if(res == i)
            {
                System.out.print(i + ",");
            }


        }
    }
    }

