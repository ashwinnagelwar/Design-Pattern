In Factory Design Patter the Abstarction is used to create object without knowing how the object is created.

It provide one level of abstraction for creating and providing object, We call method of factory class and pass some parameters on the basis of this parameters Factory Class provide required class object in return

In our example,
1. Mobile is interface which have one abstract method getMobile(String str) which using String as parameters

2. Then this mobile interface is implemented by Android and Apple class and implements its method
getMobile()

3. Then we define MobileFactory class, which contaiins static getMobile() method, and within this method
on the basis of method input it returns Android() or Apple() class obejct

4. Now in main class we call this getMobile() method of MobileFactory class, by passing "android" or "apple" as arguments and
 on the basis of this we either get Android() or Apple() class obejct.
 
 5. In this way we directly get object of required class without knowing how it created, this is call factory design 
 