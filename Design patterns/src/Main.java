import java.security.PublicKey;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Phone p1 = PhoneFactory.getPhone(PhoneType.NOTHING);
        Phone p2 = PhoneFactory.getPhone(PhoneType.ONEPLUS);

        p1.price();
        p2.price();

    }
}


interface Phone {
    void model();

    void price();
}

enum PhoneType {
    NOTHING, ONEPLUS
}

class PhoneFactory {
    public static Phone getPhone(PhoneType phone) {
        switch (phone) {
            case NOTHING -> {
                return new Nothing();
            }
            case ONEPLUS -> {
                return new Oneplus();
            }
        }
        return null;
    }
}

class Oneplus implements Phone {

    @Override
    public void model() {
        System.out.println("oneplus");
    }

    @Override
    public void price() {
        System.out.println("oneplue: 49999");
    }
}

class Nothing implements Phone {

    @Override
    public void model() {
        System.out.println("nothing");
    }

    @Override
    public void price() {
        System.out.println("nothing: 59999");
    }
}