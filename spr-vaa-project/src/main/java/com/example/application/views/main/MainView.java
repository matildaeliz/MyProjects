package com.example.application.views.main;


import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import com.vaadin.flow.component.textfield.PasswordField;
import com.vaadin.flow.component.textfield.TextField;

import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;


@PageTitle("Main")
@Route(value = "")
public class MainView extends VerticalLayout {

    public TextField name;
    private PasswordField password;
    private Button login;
    public Paragraph greeting;


    public MainView() {

        name = new TextField("Your name");
        password = new PasswordField("Your password");
        login = new Button("Login");


        login.addClickListener(e -> {
            if (name.getValue().equals("admin") && password.getValue().equals("root")) {
                //UI.getCurrent().navigate("http://localhost:8080/hello");
               hello();

            } else {
                Notification.show("Wrong ID or Password");
            }

        });


        setMargin(true);

        setHorizontalComponentAlignment(Alignment.CENTER, name, password, login);


        add(name, password, login);


    }


    public void hello() {
        greeting = new Paragraph("Hello " + name.getValue());
        add(greeting);
    }






}
