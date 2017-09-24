class Quick {
    public void sort(int numbers[], int low, int high, String array[]) {
        int a = low;
        int b = high;
        int c = numbers[low];
        while (a < b) {
            while (a < b && numbers[b] >= c)
                b--;
            if (a < b) {
                int n1 = a + 1;
                int n2 = b + 1;
                System.out.println(array[numbers[a]] + ":" + n1 + "->" + n2);
                System.out.println(array[numbers[b]] + ":" + n2 + "->" + n1);
                int temp = numbers[b];
                numbers[b] = numbers[a];
                numbers[a] = temp;
                a++;
            }
            while (a < b && numbers[a] <= c)
                a++;
            if (a < b) {
                int t1 = a + 1;
                int t2 = b + 1;
                System.out.println(array[numbers[a]] + ":" + t1 + "->" + t2);
                System.out.println(array[numbers[b]] + ":" + t2 + "->" + t1);
                int temp = numbers[b];
                numbers[b] = numbers[a];
                numbers[a] = temp;
                b--;
            }
        }
        if (a > low)
            sort(numbers, low, a - 1,array);
        if (b < high)
            sort(numbers, a + 1, high,array);
    }

}
public class huluwasort {
    public static void main(String[] args){
        int numbers[]=new int[]{2,1,4,0,6,5,3};
        String array1[]=new String[]{"老大","老二","老三","老四","老五","老六","老七"};
        String array2[]=new String[]{"赤","橙","黄","绿","青","蓝","紫"};
        for(int i = 0;i<numbers.length;i++)
        {
            for(int j = i+1;j<numbers.length;j++)
            {
                if(numbers[i]>numbers[j])
                {
                    int a=i+1;
                    int b=j+1;
                    System.out.println(array1[numbers[i]]+":"+a+"->"+b);
                    System.out.println(array1[numbers[j]]+":"+b+"->"+a);
                    int temp=numbers[i];
                    numbers[i]=numbers[j];
                    numbers[j]=temp;
                }
            }

        }
        for(int i = 0;i<numbers.length;i++)
            System.out.print(array1[numbers[i]]+" ");
        System.out.println();
        numbers=null;
        numbers=new int[]{4,1,3,5,0,2,6};
        Quick a=new Quick();
        a.sort(numbers,0,6,array2);
        for(int i = 0;i<numbers.length;i++)
            System.out.print(array2[numbers[i]]+" ");
    }
}
