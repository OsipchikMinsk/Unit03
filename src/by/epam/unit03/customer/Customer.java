package by.epam.unit03.customer;

public class Customer implements Comparable<Customer> {
    private int id;
    private String lastName; //фамилия
    private String name; //имя
    private  String patronymic; //отчество
    private String address; //адрес
    private long creditCardNumber; //номер кредитной карты
    private  long bankAccountNumber; //номер банковского счета

     Customer(int id, String lastName, String name, String patronymic, String address,
                    long creditCardNumber, long bankAccountNumber) {
        this.id = id;
        this.lastName = lastName;
        this.name = name;
        this.patronymic = patronymic;
        this.address = address;
        this.creditCardNumber = creditCardNumber;
        this.bankAccountNumber = bankAccountNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

     long getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber(long creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public long getBankAccountNumber() {
        return bankAccountNumber;
    }

    public void setBankAccountNumber(long bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }

    @Override
    public String toString() {
        return
                "User FIO=>" + lastName +" "+ name + " " + patronymic + " " +'\t'+
                "address=" + address + '\t'+
                "creditCardNumber=" + creditCardNumber + "\t"+
                "bankAccountNumber=" + bankAccountNumber +
                 "\n";
    }


    public int compareTo(Customer o) {
        return this.lastName.compareTo(o.lastName);
    }
}
