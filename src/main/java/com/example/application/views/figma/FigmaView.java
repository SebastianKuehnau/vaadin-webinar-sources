package com.example.application.views.figma;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.H4;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.tabs.Tab;
import com.vaadin.flow.component.tabs.Tabs;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Menu;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.theme.lumo.LumoUtility;

@PageTitle("Figma")
@Menu(icon = "line-awesome/svg/figma.svg", order = 2)
@Route("figma")
public class FigmaView extends VerticalLayout {

    public FigmaView() {

        VerticalLayout verticallayout = new VerticalLayout();
        verticallayout.getStyle().set("height", "788px").set("backgroundColor", "#ffffff");
        verticallayout.addClassNames(LumoUtility.Gap.LARGE, LumoUtility.Padding.MEDIUM);
        verticallayout.getElement().getThemeList().add("spacing");
        HorizontalLayout horizontallayout = new HorizontalLayout();
        horizontallayout.addClassNames(LumoUtility.AlignSelf.STRETCH, LumoUtility.Gap.SMALL, LumoUtility.Padding.MEDIUM, LumoUtility.AlignItems.CENTER);
        horizontallayout.getElement().getThemeList().add("spacing");
        VerticalLayout verticallayout2 = new VerticalLayout();
        verticallayout2.addClassNames(LumoUtility.Flex.GROW, LumoUtility.Gap.SMALL);
        verticallayout2.getElement().getThemeList().add("spacing");
        H2 customerManagement = new H2("Customer Management");
        customerManagement.addClassNames(LumoUtility.AlignSelf.STRETCH);
        verticallayout2.add(customerManagement);
        Span viewAndManageCustome = new Span("View and manage customer information, including contact details and purchase history.");
        viewAndManageCustome.addClassNames(LumoUtility.AlignSelf.STRETCH);
        verticallayout2.add(viewAndManageCustome);
        horizontallayout.add(verticallayout2);
        HorizontalLayout horizontallayout2 = new HorizontalLayout();
        horizontallayout2.addClassNames(LumoUtility.Gap.SMALL, LumoUtility.AlignItems.CENTER);
        horizontallayout2.getElement().getThemeList().add("spacing");
        Button create = new Button("Create");
        Icon icon = new Icon("lumo:play");
        icon.getStyle().set("padding", "var(--lumo-space-xs)");
        create.setPrefixComponent(icon);
        horizontallayout2.add(create);
        Button customer = new Button("Customer");
        customer.setThemeName("primary");
        Icon icon2 = new Icon("lumo:plus");
        icon2.getStyle().set("padding", "var(--lumo-space-xs)");
        customer.setPrefixComponent(icon2);
        horizontallayout2.add(customer);
        horizontallayout.add(horizontallayout2);
        verticallayout.add(horizontallayout);
        Tabs tabs = new Tabs();
        tabs.addClassNames(LumoUtility.AlignSelf.STRETCH);
        Tab all = new Tab("All");
        tabs.add(all);
        Tab recent = new Tab("Recent");
        tabs.add(recent);
        Tab favourite = new Tab("Favourite");
        tabs.add(favourite);
        verticallayout.add(tabs);
        VerticalLayout verticallayout3 = new VerticalLayout();
        verticallayout3.addClassNames(LumoUtility.AlignSelf.STRETCH, LumoUtility.Height.FULL, LumoUtility.Gap.MEDIUM, LumoUtility.Padding.MEDIUM);
        verticallayout3.getElement().getThemeList().add("spacing");
        HorizontalLayout horizontallayout3 = new HorizontalLayout();
        horizontallayout3.addClassNames(LumoUtility.AlignSelf.STRETCH, LumoUtility.Gap.SMALL, LumoUtility.AlignItems.END);
        horizontallayout3.getElement().getThemeList().add("spacing");
        TextField textfield = new TextField();
        Div div = new Div();
        Span fix = new Span("Fix");
        div.add(fix);
        textfield.setPrefixComponent(div);
        textfield.addClassNames(LumoUtility.Flex.GROW);
        horizontallayout3.add(textfield);
        HorizontalLayout horizontallayout4 = new HorizontalLayout();
        horizontallayout4.addClassNames(LumoUtility.Flex.GROW, LumoUtility.Gap.SMALL, LumoUtility.JustifyContent.END, LumoUtility.AlignItems.CENTER);
        horizontallayout4.getElement().getThemeList().add("spacing");
        Button status = new Button("Status");
        horizontallayout4.add(status);
        Button advanced = new Button("Advanced");
        horizontallayout4.add(advanced);
        horizontallayout3.add(horizontallayout4);
        verticallayout3.add(horizontallayout3);
        VerticalLayout verticallayout4 = new VerticalLayout();
        verticallayout4.getStyle().set("--lumo-utility-border-color", "var(--lumo-contrast-10pct)");
        verticallayout4.addClassNames(LumoUtility.AlignSelf.STRETCH, LumoUtility.Height.FULL, LumoUtility.Border.ALL);
        HorizontalLayout horizontallayout5 = new HorizontalLayout();
        horizontallayout5.addClassNames(LumoUtility.AlignSelf.STRETCH, LumoUtility.Gap.SMALL, LumoUtility.Padding.MEDIUM, LumoUtility.AlignItems.CENTER);
        horizontallayout5.getElement().getThemeList().add("spacing");
        H4 customers42 = new H4("Customers (42)");
        customers42.addClassNames(LumoUtility.Flex.GROW);
        horizontallayout5.add(customers42);
        Button button = new Button();
        button.setThemeName("tertiary icon");
        Icon icon3 = new Icon("lumo:ellipsis-dots-v");
        icon3.getStyle().set("padding", "var(--lumo-space-xs)");
        button.setPrefixComponent(icon3);
        horizontallayout5.add(button);
        verticallayout4.add(horizontallayout5);
        Grid<DataEntity> grid = new Grid<>(DataEntity.class);
        grid.setItems(new DataEntity("Olivia Reynolds", "olivia.reynolds@example.com", "January 5, 2024", "Acme Solutions"), new DataEntity("Ethan Patel", "ethan.patel@example.com", "February 18, 2024", "TechNova"), new DataEntity("Ava Nguyen", "ava.nguyen@example.com", "March 21, 2024", "Innovatech"), new DataEntity("Liam Rodriguez", "liam.rodriguez@example.com", "April 3, 2024", "Digital Dynamics"), new DataEntity("Zoe Kim", "zoe.kim@example.com", "May 9, 2024", "CodeCrafters"), new DataEntity("Mason Singh", "mason.singh@example.com", "June 15, 2024", "ByteWave"), new DataEntity("Harper Gupta", "harper.gupta@example.com", "July 22, 2024", "WebWise"), new DataEntity("Sebastian Martinez", "sebastian.martinez@example.com", "August 28, 2024", "TechTonic"), new DataEntity("Ella Khan", "ella.khan@example.com", "September 4, 2024", "InnovaSoft"), new DataEntity("Henry Lopez", "henry.lopez@example.com", "October 11, 2023", "DataDynamix"), new DataEntity("Sophia Chen", "sophia.chen@example.com", "November 17, 2023", ""), new DataEntity("William Ramirez", "william.ramirez@example.com", "December 24, 2023", ""), new DataEntity("January 2, 2024", "", "", ""), new DataEntity("February 8, 2024", "", "", ""), new DataEntity("March 15, 2024", "", "", ""), new DataEntity("April 21, 2024", "", "", ""), new DataEntity("May 28, 2024", "", "", ""), new DataEntity("June 4, 2024", "", "", ""), new DataEntity("July 11, 2024", "", "", ""), new DataEntity("August 17, 2024", "", "", ""), new DataEntity("September 23, 2024", "", "", ""), new DataEntity("October 30, 2024", "", "", ""), new DataEntity("November 6, 2024", "", "", ""), new DataEntity("December 13, 2024", "", "", ""));
        grid.addClassNames(LumoUtility.AlignSelf.STRETCH);
        grid.setColumns("name", "email", "lastPurchase", "organization");
        verticallayout4.add(grid);
        verticallayout3.add(verticallayout4);
        verticallayout.add(verticallayout3);
        add(verticallayout);
    }

    public record DataEntity(String name, String email, String lastPurchase, String organization) {
    }

}
