package com.example.application.views.vehicle;

import com.vaadin.flow.component.textfield.TextField;

import com.example.application.data.Vehicle;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Menu;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.PageTitle;


@Route(value = "vehicles")
@PageTitle("Vehicles")
@Menu(icon = "line-awesome/svg/car-solid.svg", order = 4)
public class VehicleView extends HorizontalLayout {

    private final Grid<Vehicle> vehicleGrid;

    public VehicleView() {
        vehicleGrid = new Grid<>(Vehicle.class);
        vehicleGrid.setItems(
            new Vehicle("Toyota", "Camry", 2020, "1234567890", "Red", 15000),
            new Vehicle("Honda", "Civic", 2019, "0987654321", "Blue", 20000)
        );
        vehicleGrid.setEmptyStateText("no data available");
        add(vehicleGrid);

        VerticalLayout verticallayout = new VerticalLayout();
        TextField id = new TextField("Id");
        id.getStyle().set("width", "5em");
        verticallayout.add(id);
        TextField make = new TextField("Make");
        verticallayout.add(make);
        TextField model = new TextField("Model");
        verticallayout.add(model);
        TextField year = new TextField("Year");
        year.getStyle().set("width", "5em");
        verticallayout.add(year);
        TextField vin = new TextField("Vin");
        verticallayout.add(vin);
        TextField color = new TextField("Color");
        verticallayout.add(color);
        TextField mileage = new TextField("Mileage");
        mileage.getStyle().set("width", "5em");
        verticallayout.add(mileage);
        verticallayout.setSizeUndefined();
        add(verticallayout);

        setPadding(true);
        setSizeFull();
    }

}
