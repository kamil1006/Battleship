class Army {

    public static void createArmy() {

        // Create all objects here

        Doctor dok = new Doctor("watson");
        General gen = new General("Ross");
        Knight k1 = new Knight("artur");
        Knight k2 = new Knight("percifal");
        Knight k3= new Knight("minionek");

        Unit u1= new Unit("101");
        Unit u2= new Unit("102");
        Unit u3= new Unit("103");
        Unit u4= new Unit("104");

        Unit u5= new Unit("105");


    }


    // Don't change the code below
    static class Unit {
        static String nameUnit;
        static int countUnit;

        public Unit(String name) {
            countUnit++;
            nameUnit = name;

        }
    }

    static class Knight {
        static String nameKnight;
        static int countKnight;

        public Knight(String name) {
            countKnight++;
            nameKnight = name;

        }
    }

    static class General {
        static String nameGeneral;
        static int countGeneral;

        public General(String name) {
            countGeneral++;
            nameGeneral = name;

        }
    }

    static class Doctor {
        static String nameDoctor;
        static int countDoctor;

        public Doctor(String name) {
            countDoctor++;
            nameDoctor = name;

        }
    }

    public static void main(String[] args) {
        createArmy();
        System.out.println(Unit.countUnit);
        System.out.println(Knight.countKnight);
        System.out.println(General.countGeneral);
        System.out.println(Doctor.countDoctor);
    }

}