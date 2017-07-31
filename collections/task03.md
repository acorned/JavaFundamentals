# Определена иерархия классов
<code>
class MedicalStaff{}
  
class Doctor extends MedicalStaff{}

class Nurse extends MedicalStaff{}

class HeadDoctor extends Doctor{}
</code>

## Укажите корректные и некорректные операторы. Дайте ответу пояснение.
|Код|Корректность|
|:------|:-----:|
|Doctor doctor1 = new Doctor();| __корректно__ |
|Doctor doctor2 = new MedicalStaff(); | __некорректно__ |
|Doctor doctor3 = new HeadDoctor(); | __корректно__ |
|Object object1 = new HeadDoctor(); | __корректно__ |
|HeadDoctor doctor5 = new Object(); | __некорректно__ |
|Doctor doctor6  = new Nurse(); | __некорректно__ |
|Nurse nurse = new Doctor(); | __некорректно__ |
|Object object2 = new Nurse(); | __корректно__ |

|List<Doctor> list1= new ArrayList<Doctor>(); | __корректно__ |
|List<MedicalStaff> list2 = new ArrayList<Doctor>(); | __некорректно__ |
|List<Doctor> list3 = new ArrayList<MedicalStaff>(); | __некорректно__ |
|List<Object> list4 = new ArrayList<Doctor>(); | __некорректно__ |
|List<Object> list5 = new ArrayList<Object>(); | __корректно__ |
