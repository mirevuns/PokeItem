package com.pokeitem.app.data.repository;

import com.pokeitem.app.data.api.PokeApi;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class ItemRepository_Factory implements Factory<ItemRepository> {
  private final Provider<PokeApi> apiProvider;

  public ItemRepository_Factory(Provider<PokeApi> apiProvider) {
    this.apiProvider = apiProvider;
  }

  @Override
  public ItemRepository get() {
    return newInstance(apiProvider.get());
  }

  public static ItemRepository_Factory create(Provider<PokeApi> apiProvider) {
    return new ItemRepository_Factory(apiProvider);
  }

  public static ItemRepository newInstance(PokeApi api) {
    return new ItemRepository(api);
  }
}
