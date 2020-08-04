# jv-equals-hashcode

Дан класс Rectangle. Переопределите в нем методы equals() и hashCode() так, чтобы equals()
сравнивал экземпляры Rectangle по содержимому полей color, width и length, а hashCode() был бы согласованным с
реализацией equals().

checklist   equals and hashcode

• Keep in mind all overriding rules for equals and hashcode.

• Use hashcode of fields while overriding hashCode method.

• Use primary number to create hashcode.

• Don’t use java.util.Objects.

• Remember that field can be null or primitive. Don’t call equals without checking it.

• Figure out the difference between instanceof and getClass() and decide which is better to use.

• While comparing fields at equals, use single return statement for all fields(e.g. return check1 && check2 && check3;).