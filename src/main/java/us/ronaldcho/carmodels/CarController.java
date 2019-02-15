package us.ronaldcho.carmodels;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.web.bind.annotation.*;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@RestController
public class CarController
{
    private final CarRepository carrepos;
    private final RabbitTemplate rt;

    public CarController(CarRepository carrepos, RabbitTemplate rt)
    {
        this.carrepos = carrepos;
        this.rt = rt;
    }

    @GetMapping("/cars")
    public List<Car> all()
    {
        return carrepos.findAll();
    }

    @GetMapping("/cars/id/{id}")
    public Car findById(@PathVariable Long id)
    {
//        Car car = carrepos.findById((id))
//                .orElseThrow(()-> new CarNotFoundException(id));
//        ArrayList cars = new ArrayList();
//        cars.add(car);
//        return  cars;
        return carrepos.findById((id))
                .orElseThrow(()-> new CarNotFoundException(id));
    }

    @GetMapping("/cars/year/{year}")
    public List<Car> carByYear(@PathVariable int year)
    {
        return carrepos.findAll().stream().filter(car -> car.getYear() == year).collect(Collectors.toList());
    }

    @GetMapping("/cars/brand/{brand}")
    public List<Car> carByBrand(@PathVariable String brand)
    {
        return carrepos.findAll().stream().filter(car -> car.getBrand().toLowerCase().equals(brand.toLowerCase())).collect(Collectors.toList());
    }

    @PostMapping("/cars/upload")
    public List<Car> uploadCar(@RequestBody List<Car> cars)
    {
        CarLog carLog = new CarLog("Uploaded car data set");
        rt.convertAndSend(WorldcarmodelsApplication.QUEUE_NAME, carLog.toString());
        log.info("..........Data loaded ............");

        return carrepos.saveAll(cars);
    }

    @DeleteMapping("/cars/delete/{id}")
    public void cardeleteById(@PathVariable long id)
    {
        CarLog carLog = new CarLog("Uploaded car data set");
        rt.convertAndSend(WorldcarmodelsApplication.QUEUE_NAME, carLog.toString());
        log.info("DELETED RECORD ID " + id + " NOW!!!");
        carrepos.deleteById(id);
    }
    //    public List<Car> cardeleteById(@PathVariable Long id)
//    {
//        Car car = carrepos.findById(id).orElseThrow(() -> new CarNotFoundException(id));
//        carrepos.delete(car);
//        return car;
//    }
}
