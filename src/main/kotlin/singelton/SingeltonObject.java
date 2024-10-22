import singelton.Retrofit;

public static void main(String[] args) {
    Retrofit instance = Retrofit.getNewInstance();
    Retrofit instance2 = Retrofit.getNewInstance();
}