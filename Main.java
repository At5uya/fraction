public class Main {

    public static void main(String[] args) {
        System.out.println(Omgopai.createNormalised(120, 12));
        System.out.println(Omgopai.createNormalised(4, 12));
        System.out.println(new Omgopai(2, 4).plus(new Omgopai(3, 9)));
        System.out.println(new Omgopai(2, 4).minus(new Omgopai(3, 9)));
        System.out.println(new Omgopai(2, 4).times(new Omgopai(3, 9)));
        System.out.println(new Omgopai(2, 4).dividedBy(new Omgopai(3, 9)));
    }
}