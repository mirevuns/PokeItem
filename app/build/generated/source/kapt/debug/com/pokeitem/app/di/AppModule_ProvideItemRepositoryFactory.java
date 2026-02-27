package com.pokeitem.app.di;

import com.pokeitem.app.data.api.PokeApi;
import com.pokeitem.app.data.repository.ItemRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
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
public final class AppModule_ProvideItemRepositoryFactory implements Factory<ItemRepository> {
  private final Provider<PokeApi> apiProvider;

  public AppModule_ProvideItemRepositoryFactory(Provider<PokeApi> apiProvider) {
    this.apiProvider = apiProvider;
  }

  @Override
  public ItemRepository get() {
    return provideItemRepository(apiProvider.get());
  }

  public static AppModule_ProvideItemRepositoryFactory create(Provider<PokeApi> apiProvider) {
    return new AppModule_ProvideItemRepositoryFactory(apiProvider);
  }

  public static ItemRepository provideItemRepository(PokeApi api) {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideItemRepository(api));
  }
}
