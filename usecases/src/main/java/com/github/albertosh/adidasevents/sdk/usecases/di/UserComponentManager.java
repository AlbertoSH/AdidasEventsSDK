package com.github.albertosh.adidasevents.sdk.usecases.di;

public interface UserComponentManager {

    public PublicUseCasesComponent getUserComponent();

    public void createUserComponent(String token);

    public void deleteUserComponent();

}
