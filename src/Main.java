import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        khởi tạo các biến
        Scanner userInput = new Scanner(System.in);
        int size;
        int[] arrNum;
        int newInt;
        int newPos;

//        tạo scanner cho người dùng nhập kích thước mảng
        System.out.print("Nhập kích thước mảng: ");
//        gán scanner được nhập cho biến size
        size = userInput.nextInt();
//        rồi gán biến size cho kích thước của arrNum
        arrNum = new int[size];
//        nhập liệu ngẫu nhiên vào mảng với math.random
        for (int i = 0; i < size; i++) {
            arrNum[i] = (int) (Math.floor(Math.random() * 100 + 1));
        }
//        in mảng
        for (int j = 0; j < arrNum.length; j++) {
            System.out.println("Số " + arrNum[j] + " tại vị trí " + j);
        }
//        nhập các thông số mới để điền vào mảng
        System.out.print("Nhập số muốn điền vào trong mảng: ");
        newInt = userInput.nextInt();
        System.out.print("Nhập index muốn truyền số mới vào trong mảng: ");
        newPos = userInput.nextInt();
//        kiểm tra xem vị trí nhập vào có hợp lệ không
        if (newPos <= -1 || newPos >= arrNum.length) {
            System.out.println("Vị trí này vượt quá khả năng nhập");
            System.exit(0);
        } else {
//            khởi tạo 1 mảng mới
            int []newArr = new int[size + 1];
            for (int k = 0; k < newArr.length; k++) {
                if (k < newPos) {
                    newArr[k] = arrNum[k];
                } else if (k == newPos) {
                    newArr[k] = newInt;
                } else {
                    newArr[k] = arrNum[k - 1];
                }
            }
//        in mảng
            for (int j = 0; j < newArr.length; j++) {
                System.out.println("Số " + newArr[j] + " tại vị trí " + j);
            }

        }
    }
}
