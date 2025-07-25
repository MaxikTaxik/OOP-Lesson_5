public class SumModel extends CalcModel {
    public SumModel() {
    }

    @Override
    public int result() {
        return x + y;
    }
    
    @Override
    public void setOperandX(int operand) {
        super.x = operand;
    }
    
    @Override
    public void setOperandY(int operand) {
        super.y = operand;
    }


}
