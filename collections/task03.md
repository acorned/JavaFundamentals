# Задание 3. Ссылки на коллекции 

Определена иерархия классов
~~~java
  class MedicalStaff{}  
  class Doctor extends MedicalStaff{}  
  class Nurse extends MedicalStaff{}  
  class HeadDoctor extends Doctor{}  
~~~

Укажите корректные и некорректные операторы. Дайте ответу пояснение.

|Код|Корректность|
|:---------|:--------:|
|Doctor doctor1 = new Doctor();| __корректно__ |
|Doctor doctor2 = new MedicalStaff(); | __некорректно__ |
|Doctor doctor3 = new HeadDoctor(); | __корректно__ |
|Object object1 = new HeadDoctor(); | __корректно__ |
|HeadDoctor doctor5 = new Object(); | __некорректно__ |
|Doctor doctor6  = new Nurse(); | __некорректно__ |
|Nurse nurse = new Doctor(); | __некорректно__ |
|Object object2 = new Nurse(); | __корректно__ |
|List&lt;Doctor&gt; list1= new ArrayList&lt;Doctor&gt;(); | __корректно__ |
|List&lt;MedicalStaff&gt; list2 = new ArrayList&lt;Doctor&gt;(); | __некорректно__ |
|List&lt;Doctor&gt; list3 = new ArrayList&lt;MedicalStaff&gt;(); | __некорректно__ |
|List&lt;Object&gt; list4 = new ArrayList&lt;Doctor&gt;(); | __некорректно__ |
|List&lt;Object&gt; list5 = new ArrayList&lt;Object&gt;(); | __корректно__ |
  
