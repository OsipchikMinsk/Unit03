package by.epam.unit03.customer;

import java.util.Arrays;

public class CustomerOperator {


   private Customer[] customerGroup;

    public CustomerOperator(Customer[] customerGroup) {
        this.customerGroup = customerGroup;
    }

    Customer[] sortCustomerByLastName() {
        Arrays.sort(customerGroup);
        return customerGroup;
    }


    void findUsersByCreditCard(long start, long finish) {
        int size = customerGroup.length;
        for (int i = 0; i < size; i++) {
            if (customerGroup[i].getCreditCardNumber() >= start && customerGroup[i].getCreditCardNumber() <= finish) {
                System.out.println(customerGroup[i].toString());
            }
        }
    }






}
