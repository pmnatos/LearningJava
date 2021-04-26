package FunctionalModuleExample;

public class SumFunctionalModuleImpl implements SumFunctionalModule {

    @Override
    public Integer sum(Integer a, Integer b) {
        return a+b;
    }
}
