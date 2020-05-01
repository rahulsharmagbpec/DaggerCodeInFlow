# DaggerCodeInFlow
1. Constructor injection cannot be applied to activity
    CarComponent carComponent = DaggerCarComponent.
    car = carComponent.getCar();

    @Component
    public interface CarComponent {
        Car getCar();
    }


2. Field inject variable should be public and should not be final
    @Inject
    Car car;
    onCreate(){
        carComponent.inject(MainActivity.this);
    }

3. Method injection (less commonly used, some people never used)
    Dagger first call : Constructor Injection -->> Field Injection -->> Method Injection