package com.example.application.views.empty;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.router.Menu;
import com.vaadin.flow.router.Route;

@Menu(icon = "line-awesome/svg/hand-paper.svg", order = 5)
@Route("empty")
public class EmptyView extends Div {
    public EmptyView() {
        Image image = new Image();
        image.setSrc("images/image.webp");
        image.setAlt("");
        add(image);
    }
}
