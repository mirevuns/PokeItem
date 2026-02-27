package com.pokeitem.app.data.api;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0006J\"\u0010\u0007\u001a\u00020\b2\b\b\u0003\u0010\t\u001a\u00020\n2\b\b\u0003\u0010\u000b\u001a\u00020\nH\u00a7@\u00a2\u0006\u0002\u0010\f\u00a8\u0006\r"}, d2 = {"Lcom/pokeitem/app/data/api/PokeApi;", "", "getItemDetail", "Lcom/pokeitem/app/data/dto/ItemDetailDto;", "idOrName", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getItemList", "Lcom/pokeitem/app/data/dto/ItemListResponseDto;", "limit", "", "offset", "(IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface PokeApi {
    
    @retrofit2.http.GET(value = "item")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getItemList(@retrofit2.http.Query(value = "limit")
    int limit, @retrofit2.http.Query(value = "offset")
    int offset, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.pokeitem.app.data.dto.ItemListResponseDto> $completion);
    
    @retrofit2.http.GET(value = "item/{idOrName}/")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getItemDetail(@retrofit2.http.Path(value = "idOrName")
    @org.jetbrains.annotations.NotNull
    java.lang.String idOrName, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.pokeitem.app.data.dto.ItemDetailDto> $completion);
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 3, xi = 48)
    public static final class DefaultImpls {
    }
}