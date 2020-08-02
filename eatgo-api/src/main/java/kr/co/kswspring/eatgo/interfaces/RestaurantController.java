package kr.co.kswspring.eatgo.interfaces;


import kr.co.kswspring.eatgo.domain.Restaurant;
import kr.co.kswspring.eatgo.domain.RestaurantRepository;
import kr.co.kswspring.eatgo.domain.RestaurantRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RestaurantController {

    @Autowired//스프링이 알아서 respository 객체를 생성해준다.
    private RestaurantRepository repository;//Autowired가 있기 때문에 가능.
//    private RestaurantRepository repository = new RestaurantRepository();

    @GetMapping("/restaurants")
    public List<Restaurant> list() {
//        List<Restaurant> restaurants = new ArrayList<>();
//
//        restaurants.add(new Restaurant(1004L, "Bob zip", "Seoul"));
//        restaurants.add(new Restaurant(2020L, "Cyber Food", "Seoul"));

        List<Restaurant> restaurants = repository.findAll();

        return restaurants;
    }

    @GetMapping("/restaurants/{id}")
    public Restaurant detail(@PathVariable("id") Long id) {
//        List<Restaurant> restaurants = new ArrayList<>();
//
//        restaurants.add(new Restaurant(1004L, "Bob zip", "Seoul"));
//        restaurants.add(new Restaurant(2020L, "Cyber Food", "Seoul"));

        Restaurant restaurant = repository.findById(id);//중복된 코드 제거 위해 domain에서 repository만듦.

//        Restaurant restaurant = restaurants.stream()
//                .filter(r -> r.getId().equals(id))
//                .findFirst()
//                .orElse(null);//이것은 원래 컨트롤러가 하는 것이 아니다.

        return restaurant;
    }
}
