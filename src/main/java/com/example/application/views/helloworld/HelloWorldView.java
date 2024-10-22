package com.example.application.views.helloworld;

import com.vaadin.flow.data.binder.Binder;
import com.vaadin.flow.data.binder.ValidationException;
import com.vaadin.flow.theme.lumo.LumoUtility;

import com.vaadin.flow.component.grid.Grid;

import com.vaadin.flow.component.Key;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Menu;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

import java.util.HashSet;
import java.util.Set;

@PageTitle("Hello World")
@Menu(icon = "line-awesome/svg/globe-solid.svg", order = 0)
@Route("")
public class HelloWorldView extends VerticalLayout {

    private final Grid<UserEntity> grid = new Grid<>(UserEntity.class);
    private TextField name;
    private Button sayHello;

    private final Set<UserEntity> userEntitySet = new HashSet<>();

    private final Binder<UserEntity> userEntityBinder = new Binder<>(UserEntity.class);

    public HelloWorldView() {
        name = new TextField("Your name");
        userEntityBinder.forField(name).bind("name");

        sayHello = new Button("Say hello");
        sayHello.getElement().setAttribute("theme", "primary");
        sayHello.addClickListener(e -> {
            Notification.show("Hello " + name.getValue());
            UserEntity userEntity = null;
            try {
                userEntity = userEntityBinder.writeRecord();
            } catch (ValidationException ex) {
                throw new RuntimeException(ex);
            }
            userEntitySet.add(userEntity);
            grid.getDataProvider().refreshAll();

        });
        sayHello.addClickShortcut(Key.ENTER);

        HorizontalLayout innerLayout = new HorizontalLayout(name, sayHello);
        innerLayout.setVerticalComponentAlignment(Alignment.END, name, sayHello);

        grid.setItems(userEntitySet);
        grid.setEmptyStateText("No data available");

        add(innerLayout, grid);

        setPadding(true);
        addClassNames(LumoUtility.Padding.MEDIUM);
    }

    public record UserEntity(String name) {
    }

}
