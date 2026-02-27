package com.pokeitem.app.ui.detail;

import com.pokeitem.app.data.repository.ItemRepository;
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
public final class ItemDetailViewModel_Factory implements Factory<ItemDetailViewModel> {
  private final Provider<ItemRepository> repositoryProvider;

  public ItemDetailViewModel_Factory(Provider<ItemRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public ItemDetailViewModel get() {
    return newInstance(repositoryProvider.get());
  }

  public static ItemDetailViewModel_Factory create(Provider<ItemRepository> repositoryProvider) {
    return new ItemDetailViewModel_Factory(repositoryProvider);
  }

  public static ItemDetailViewModel newInstance(ItemRepository repository) {
    return new ItemDetailViewModel(repository);
  }
}
