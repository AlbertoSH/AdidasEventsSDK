package com.github.albertosh.adidasevents.sdk.usecases.events.getall;

import com.github.albertosh.adidasevents.sdk.models.Event;

import java.util.List;

import javax.annotation.Nullable;

import rx.Observable;

public interface IGetAllEventsUseCase {

    default Observable<List<Event>> execute() {
        return execute(null);
    }

    Observable<List<Event>> execute(@Nullable String language);

}
