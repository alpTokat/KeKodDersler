package singelton;


/**
 *  Bir Class'ı singelton yapmak demek sadece 1 defa objesinin olusuturulması demektir.
 *  Buda o class'ın constructor'unu private yapmakla mümkündür.
 *
 *  constructor'u private yapmak dışardan objesini oluşturmayı engellemektedir.
 *  Bu class'ın objesini bir değişkene atarak bu değerin null olduğu durumda yeni bir obje oluşturmasını
 *  eğer ki null değilse aynı objeyi retun etmesini sağladığımız zaman aslında tek bir instance yapılmış olur.
 *  Thread olayından dolayı yeni instance olusturma fonksiyonunun senkronize bir şekilde yapmak için
 *  synchronized keyword'unu kullanıyoruz ve instance degiskeninde yapılan degisikliklerini diger
 *  threadlerde haberder olmasını sağlamak icin
 */
public class Retrofit {

    private static volatile Retrofit newInstance;

    String baseUrl ="www.google.com";

    private Retrofit(){ //Constructor

    }

    public String getBaseUrl(){
        return baseUrl;
    }

    public void setBaseUrl(String baseUrl){this.baseUrl = baseUrl;}

    public static synchronized Retrofit getNewInstance(){
        if (newInstance == null){
            newInstance = new Retrofit();
        }
        return newInstance;
    }

}
