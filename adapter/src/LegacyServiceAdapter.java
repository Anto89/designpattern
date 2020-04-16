public class LegacyServiceAdapter implements Service {
    private LegacyService legacyService;

    public LegacyServiceAdapter(LegacyService legacyService) {
        this.legacyService = legacyService;
    }

    @Override
    public void doSomething() {
        legacyService.doSomethingOldSchool();
    }
}
