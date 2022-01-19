# InnovaJavaSpringHomework
Patika İnnova Bootcamp Homework-1

1 - Alternatives

Farklı amaçlar için kullandığınız bir "Bean"in birden fazla versiyonuna sahipseniz, geliştirme aşamasında bir niteleyiciyi enjekte ederek bunlar arasında seçim yapabilirsiniz. Yani alternative anotasyonu inject işlemi yaparken hangi class’ı inject edeceğini bilemediğinden bizden gerekli konfigürasyonları yapmamızı ister. Bunu birbirinin yerine tercih ettiğimiz classların üstüne @Alternative anotasyonu kullanarak belirtebilir, beans.xml adlı dosyanın içerisine tanımlayarak hangi class’ı inject edeceğini söyleyebiliriz.

2 - Qualifier

Bir interface implementasyonu birden fazla ise veya bir sınıfın örnekleri hafızada birden fazla ise spring IOC yapısında hangi interface ile hangi sınıfı bağlayacağını bilemeyecektir. Hangi java bean'ını hangi anda kullanmak istediğini daha net belirlemek için kullanılır. Qualifier anotasyonunda beans.xml ile ilgili bir değişiklik yapmadan kullanabiliriz.

3 - Interceptor

Interceptor bir metodun tetiklenmesi ile aynı anda başka metodu otomatik olarak çağırmak ve çalıştırmak istediğimizde bu işi yerine getiren mekanizmadır.  Şöyle düşünelim ki birkaç  metot tetiklendiğinde aynı işi yapan bazı blokları olacak. Biz aynı kısımları bir metoda toplayıp Interceptor ile metotlar tetiklendiğinde gerekli işlemleri yine yaptırabiliriz, böylece kod kalabalığından kurtuluruz ve bakımı da kolaylaştırılmış olur.

4 - Stereotype

Stereotype, anotasyonları birleştirmek ve bir araya getirerek kullanımı kolaylaştırır.
