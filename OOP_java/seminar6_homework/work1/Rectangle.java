package seminar6_homework.work1;

//  пример похожий про животных /рыбок в семинаре на 54й минуте разбирали
// Наследник не должен "ломать" поведение
// Наследник не должен делать меньше чем родитель
//  Ввиду большой загрузки на основной работе (более 84 часов в неделю)
//  а также, что основным направлением, все же, хочу использовать Python, на который я и поступал
// я скопировал работу и построчно разобрался с реализацией
// на большее, к сожалению, времени не хватило. Что куда идет и почему - понтяно. Написать с нуля,
// конечно, значительно сложнее, но времени не хватает =(
// приходится расставлять приоритеты
// в task1 и task3 что не так  было понятно еще до того, как подсмотрел реализацию. в task2 - после.

abstract class AbstractFigure {  // Высоту определяем только у прямоугольника, для квадрата достаточно ширины (width)
    int width;
    public String getType() {
        return "Геометрическая фигура";
    }
}

interface Heigth {                // Например - для площади, в каких-то фигурах может использоваться, а в каких-то нет
    int setSquare();
}

class Rectangle extends AbstractFigure implements Heigth {
    int heigth;
    public String getType() {
        return "Прямоугольник";
    }
    public void setWidth(int width) { this.width = width; }
    public void setHeigth(int heigth) { this.heigth = heigth; }
    @Override
    public int setSquare() { return width*heigth; }
}

class Square extends AbstractFigure {
    public String getType() {
        return "Квадрат";
    }
    public void setWidth(int width) { this.width = width; }
    public int setSquare() { return width*width; }

}