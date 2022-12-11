package DesignPattern.Chapter02.ch04_Builder.gof;

public interface MakeReport {

    public void MakeHeader();
    public void MakeBody();
    public void MakeFooter();

    public String getReport();
}
