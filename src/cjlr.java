import java.util.Scanner;//就是导入 java.util 包下的 Scanner 类，导入后才能使用它。
public class cjlr {
        public static void main(String[] args) {
            System.out.println("请输入成绩");
            Scanner in=new Scanner(System.in);//创建对象
            System.out.print("请输入一个整数：");
            int n=in.nextInt();//赋值给变量n
            if(90 <= n && n<= 100){
                System.out.println("A");
            }
            if(80 <= n && n<= 89){
                System.out.println("B");
            }
            if(70 <= n && n<= 79){
                System.out.println("C");
            }
            if(60 <= n && n<= 69){
                System.out.println("D");
            }
            if(0 <= n && n<= 59){
                System.out.println("E");
            }
        }
    }

