package by.epam.unit03.customer;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Customer c1 = new Customer(1, "Petrov", "Fedor", "Ivanovich",
                "Moscow, st.New Arbat 10-4",102030304040405050L, 1);
        Customer c2 = new Customer(2, "Kapula", "Andrej", "Sergeevich",
                "London, st Time Squer 1-1",202130304040405050L, 2);
        Customer c3 = new Customer(3, "Sapak", "Oleg", "Petrovich",
                "Minsk, st. Bogdanovicha 4-20",302230304040405050L, 3);
        Customer c4 = new Customer(4, "Sidorov", "Ivan", "Alexeevich",
                "New York, st. Good 10-35 ",402330304040405050L, 4);
        Customer c5 = new Customer(5, "Chekhov", "Egor", "Konstantinovich",
                "Roma, st. Theater 20-99",502030304040405050L, 5);
        Customer c6 = new Customer(6, "Smekhov", "Sergey", "Olegovich",
                "Lima, st. Fargo 1-1",602030304040405050L, 6);
        Customer c7 = new Customer(7, "Astakhov", "Gleb", "Valerievich",
                "Borisov, st. Gvardeyskaya 3-9", 702030304040405050L, 7);
        Customer c8 = new Customer(8, "Larin", "Anton", "Viktorovich",
                "Brest, st Gagarin 20-97",802030304040405050L, 8);

        Customer [] groupOfUsers = new Customer[8];
        groupOfUsers[0] = c1;
        groupOfUsers[1] = c2;
        groupOfUsers[2] = c3;
        groupOfUsers[3] = c4;
        groupOfUsers[4] = c5;
        groupOfUsers[5] = c6;
        groupOfUsers[6] = c7;
        groupOfUsers[7] = c8;
        CustomerOperator operator = new CustomerOperator(groupOfUsers);
        System.out.println(Arrays.toString(groupOfUsers));
        System.out.println("----------------------------------");
        System.out.println(Arrays.toString(operator.sortCustomerByLastName()) );
        System.out.println("------------------------");
        operator.findUsersByCreditCard(302230304040405050L,602030304040405050L);




    }



}