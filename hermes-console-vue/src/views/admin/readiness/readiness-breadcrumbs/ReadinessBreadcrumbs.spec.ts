import { render } from '@/utils/test-utils';
import ReadinessBreadcrumbs from '@/views/admin/readiness/readiness-breadcrumbs/ReadinessBreadcrumbs.vue';

describe('ReadinessBreadcrumbs', () => {
  const props = {
    groupId: 'pl.allegro.public.group',
    topicId: 'pl.allegro.public.group.DummyEvent',
    subscriptionId: 'foobar-service',
  };

  it('should render `home` breadcrumb with an anchor to a home page', () => {
    // given
    const { getByText } = render(ReadinessBreadcrumbs, { props });

    // when
    const element = getByText(
      'readiness.breadcrumbs.home',
    ) as HTMLAnchorElement;

    // then
    expect(element).toHaveAttribute('href', '/');
  });
});
