package app; //папка

public class Calculater {
    public int a;
    public int b;
    public int ans;
    public char op; // объ переменных
    
    public void calculate() { //
        this.multiply();
        this.divide();
        this.procent();
        this.plus();
        this.minus();
        this.answer();
    }
    
    private void multiply() { //методы в пару строчек
        if (this.op == '*') {
            this.ans = this.a * this.b;
        }
    }

    private void divide() {
        if (this.op == '/') {
            this.ans = this.a / this.b;
        }
    }

    private void procent() {
        if (this.op == '%') {
            this.ans = this.a % this.b;
        }
    }

    private void plus() {
        if (this.op == '+') {
            this.ans = this.a + this.b;
        }
    }

    private void minus() {
        if (this.op == '-') {
            this.ans = this.a - this.b;
        }
    }

    private void answer() {
        System.out.println("Ответ: " + this.ans);
    }
}

