package masmidia.digital.one.core.utils;

import masmidia.digital.one.core.utils.Internas.DivHelper;
import masmidia.digital.one.core.utils.Internas.MultHelper;
import masmidia.digital.one.core.utils.Internas.SubHelper;
import masmidia.digital.one.core.utils.Internas.SumHelper;

public class Calculadora {

    private DivHelper divHelper;
    private MultHelper multHelper;
    private SubHelper subHelper;
    private SumHelper sumHelper;

    public void calculadora() {
        divHelper = new DivHelper();
        multHelper = new MultHelper();
        subHelper = new SubHelper();
        sumHelper = new SumHelper();
    }

    public int sum(int a, int b) {
        return sumHelper.execute(a, b);
    }

    public int sub(int a, int b) {

        return subHelper.execute(a, b);
    }

    public int mult(int a, int b) {
        return multHelper.execute(a, b);
    }

    public int div(int a, int b) {
        return divHelper.execute(a, b);
    }
}
