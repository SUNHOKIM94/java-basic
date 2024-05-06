package ref;

public class MethodChange2 {

    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10;
        System.out.println("메서드 호출 전 : dataA.value = " + dataA.value); // 10
        chagneReference(dataA);
        System.out.println("메서드 호출 후 : dataA.value = " + dataA.value); // 20
    }

    public static void chagneReference(Data dataX) {
        dataX.value = 20;
    }
}
