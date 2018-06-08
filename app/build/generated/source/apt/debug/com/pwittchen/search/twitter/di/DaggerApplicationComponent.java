package com.pwittchen.search.twitter.di;

import com.pwittchen.search.twitter.di.module.NetworkModule;
import com.pwittchen.search.twitter.di.module.NetworkModule_ProvideNetworkApiFactory;
import com.pwittchen.search.twitter.di.module.TwitterModule;
import com.pwittchen.search.twitter.di.module.TwitterModule_ProvideTwitterApiFactory;
import com.pwittchen.search.twitter.network.NetworkApi;
import com.pwittchen.search.twitter.twitter.TwitterApi;
import com.pwittchen.search.twitter.ui.MainActivity;
import com.pwittchen.search.twitter.ui.MainActivity_MembersInjector;
import dagger.MembersInjector;
import dagger.internal.Preconditions;
import dagger.internal.ScopedProvider;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DaggerApplicationComponent implements ApplicationComponent {
  private Provider<TwitterApi> provideTwitterApiProvider;

  private Provider<NetworkApi> provideNetworkApiProvider;

  private MembersInjector<MainActivity> mainActivityMembersInjector;

  private DaggerApplicationComponent(Builder builder) {
    assert builder != null;
    initialize(builder);
  }

  public static Builder builder() {
    return new Builder();
  }

  public static ApplicationComponent create() {
    return builder().build();
  }

  @SuppressWarnings("unchecked")
  private void initialize(final Builder builder) {

    this.provideTwitterApiProvider =
        ScopedProvider.create(TwitterModule_ProvideTwitterApiFactory.create(builder.twitterModule));

    this.provideNetworkApiProvider =
        ScopedProvider.create(NetworkModule_ProvideNetworkApiFactory.create(builder.networkModule));

    this.mainActivityMembersInjector =
        MainActivity_MembersInjector.create(provideTwitterApiProvider, provideNetworkApiProvider);
  }

  @Override
  public void inject(MainActivity mainActivity) {
    mainActivityMembersInjector.injectMembers(mainActivity);
  }

  public static final class Builder {
    private TwitterModule twitterModule;

    private NetworkModule networkModule;

    private Builder() {}

    public ApplicationComponent build() {
      if (twitterModule == null) {
        this.twitterModule = new TwitterModule();
      }
      if (networkModule == null) {
        this.networkModule = new NetworkModule();
      }
      return new DaggerApplicationComponent(this);
    }

    public Builder twitterModule(TwitterModule twitterModule) {
      this.twitterModule = Preconditions.checkNotNull(twitterModule);
      return this;
    }

    public Builder networkModule(NetworkModule networkModule) {
      this.networkModule = Preconditions.checkNotNull(networkModule);
      return this;
    }
  }
}
