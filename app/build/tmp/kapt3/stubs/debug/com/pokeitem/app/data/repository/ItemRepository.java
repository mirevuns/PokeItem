package com.pokeitem.app.data.repository;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J$\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tH\u0086@\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\b\n\u0010\u000bJ6\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u0010H\u0086@\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0002\b!\n\u0005\b\u00a1\u001e0\u0001\u00a8\u0006\u0014"}, d2 = {"Lcom/pokeitem/app/data/repository/ItemRepository;", "", "api", "Lcom/pokeitem/app/data/api/PokeApi;", "(Lcom/pokeitem/app/data/api/PokeApi;)V", "getItemDetail", "Lkotlin/Result;", "Lcom/pokeitem/app/domain/model/ItemDetailUiModel;", "idOrName", "", "getItemDetail-gIAlu-s", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getItemList", "", "Lcom/pokeitem/app/domain/model/ItemListUiModel;", "limit", "", "offset", "getItemList-0E7RQCE", "(IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class ItemRepository {
    @org.jetbrains.annotations.NotNull
    private final com.pokeitem.app.data.api.PokeApi api = null;
    
    @javax.inject.Inject
    public ItemRepository(@org.jetbrains.annotations.NotNull
    com.pokeitem.app.data.api.PokeApi api) {
        super();
    }
}