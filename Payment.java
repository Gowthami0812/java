interface Payment {
    void pay();
}

class CreditCard implements Payment {
    public void pay() {
        System.out.println("Paid using Credit Card");
    }
}

class PayPal implements Payment {
    public void pay() {
        System.out.println("Paid using PayPal");
    }
}

class Cash implements Payment {
    public void pay() {
        System.out.println("Paid using Cash");
    }
}

class Main {
    public static void main(String[] args) {
        Payment p = new PayPal();
        p.pay();
    }
}

