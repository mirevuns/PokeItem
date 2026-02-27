package com.pokeitem.app.ui.list;

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
public final class ItemListViewModel_Factory implements Factory<ItemListViewModel> {
  private final Provider<ItemRepository> repositoryProvider;

  public ItemListViewModel_Factory(Provider<ItemRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public ItemListViewModel get() {
    return newInstance(repositoryProvider.get());
  }

  public static ItemListViewModel_Factory create(Provider<ItemRepository> repositoryProvider) {
    return new ItemListViewModel_Factory(repositoryProvider);
  }

  public static ItemListViewModel newInstance(ItemRepository repository) {
    return new ItemListViewModel(repository);
  }
}
