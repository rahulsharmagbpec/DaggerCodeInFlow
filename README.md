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

4. Modules and Provides (tell to dagger how to create new object)
    suppose if we cannot edit Wheels class because of library or something else then how to inject dependency

    @Module
    public class WheelModule {
        @Provides
        static Rims provideRims() {
            return new Rims();
        }

        @Provides
        static Tyres provideTyres() {
            Tyres tyres = new Tyres();
            tyres.inflate();
            return tyres;
        }

        @Provides
        static Wheels provideWheels(Rims rims, Tyres tyres) {
            return new Wheels(rims, tyres);
        }
    }
5. Now if dependency have to inject into Interface
    because interface doesn't have constructor.

    interface Engine{
        void start();
    }
    class PetrolEngin extend Engine{
    void start(){
        Log.e(TAG, "started");
    }}

    @Component(modules = {WheelModule.class, PetrolEngineModule.class})
    class CarComponent
