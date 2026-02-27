package com.pokeitem.app.di;

import com.pokeitem.app.data.api.PokeApi;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import retrofit2.Retrofit;

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
public final class AppModule_ProvidePokeApiFactory implements Factory<PokeApi> {
  private final Provider<Retrofit> retrofitProvider;

  public AppModule_ProvidePokeApiFactory(Provider<Retrofit> retrofitProvider) {
    this.retrofitProvider = retrofitProvider;
  }

  @Override
  public PokeApi get() {
    return providePokeApi(retrofitProvider.get());
  }

  public static AppModule_ProvidePokeApiFactory create(Provider<Retrofit> retrofitProvider) {
    return new AppModule_ProvidePokeApiFactory(retrofitProvider);
  }

  public static PokeApi providePokeApi(Retrofit retrofit) {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.providePokeApi(retrofit));
  }
}
