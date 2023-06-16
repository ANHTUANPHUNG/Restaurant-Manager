package scr.Services;

import scr.Body.Menu;

import java.util.ArrayList;
import java.util.List;

public class DishesServices {
    List<Menu> dishesMenu = new ArrayList<>();

    public DishesServices() {
    }

    public List<Menu> getDishesMenu()
    {
        return dishesMenu;
    }

    public void addDishesMenu(Menu menu) {
        dishesMenu.add(menu);
    }
    public void removeUser(int id){
        for (Menu menu : dishesMenu){
            if(menu.getId() == id){
                dishesMenu.remove(menu);
                break;
            }
        }
    }
}
