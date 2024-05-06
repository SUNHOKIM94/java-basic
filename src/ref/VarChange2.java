package ref;

public class VarChange2 {

    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10;
        Data dataB = new Data();

        System.out.println("dataA 참조값 = " + dataA); // 주소 값
        System.out.println("dataB 참조값 = " + dataB); // 주소 값
        System.out.println("dataA value = " + dataA); // 10
        System.out.println("dataB value = " + dataB); // 10

        // dataA 변경
        dataA.value = 20;
        System.out.println("변경 dataA.value = 20");
        System.out.println("dataA.value = " + dataA); // 20
        System.out.println("dataB.value = " + dataB); // 20

        dataB.value = 30;
        System.out.println("변경 dataB.value = 30");
        System.out.println("dataA.value = " + dataA); // 30
        System.out.println("dataB.value = " + dataB); // 30
    }
}
