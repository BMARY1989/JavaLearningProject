package md.teckwillacademy.methodstask;

public class ExecutionaService {
    public static void main(String[] args) {
        System.out.println(DataGeneratorUtil.getRandomInt(20,100));
        System.out.println(DataGeneratorUtil.getRandomInt(100,120));
        System.out.println(DataGeneratorUtil.getRandomInt(120,100));

        int randomInt = DataGeneratorUtil.getRandomInt(-50);
        System.out.println(randomInt);

        System.out.println(DataGeneratorUtil.getRandomEmail("gmail,com"));
        System.out.println(DataGeneratorUtil.getRandomEmail("gmail,com"));
        System.out.println(DataGeneratorUtil.getRandomEmail("gmail,com"));
        System.out.println(DataGeneratorUtil.getRandomEmail("gmail,com"));


        Customer customer1 = new Customer("Fat Frumos", "Masculin",233767345);

       String infoAboutCustomer1=customer1.toString();
       System.out.println(infoAboutCustomer1);

       customer1.setAge(85);
       System.out.println(customer1.toString());
       customer1.setName("Fat Consazeana");
       System.out.println(customer1.toString());
       System.out.println("Varsta lui Fat este:" + customer1.getAge());
        System.out.println("familia lui Fat este:" + customer1.getName());





         }
}

