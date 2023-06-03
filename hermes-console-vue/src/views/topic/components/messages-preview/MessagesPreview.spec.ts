import { describe, expect } from 'vitest';
import { render } from '@/utils/test-utils';
import MessagesPreview from '@/views/topic/components/messages-preview/MessagesPreview.vue';
import { dummyTopicMessagesPreview } from '@/dummy/topic';
import userEvent from '@testing-library/user-event';

describe('MessagesPreview', () => {
  const props = { messages: dummyTopicMessagesPreview };

  it('should render title properly', () => {
    // given
    const { getByText } = render(MessagesPreview, { props });

    // expect
    expect(getByText('Topic messages preview')).toBeVisible();
  });

  it('should render all messages', async () => {
    // given
    const user = userEvent.setup();
    const { getByText, container } = render(MessagesPreview, { props });

    // when
    await user.click(getByText('Topic messages preview'));

    dummyTopicMessagesPreview.forEach((message, index) => {
      const codeBlock = container.querySelectorAll('.v-code')[index];

      // then
      expect(codeBlock).toBeVisible();

      // and
      expect(codeBlock?.textContent?.replace(/\s/g, '')).toEqual(
        message.content,
      );
    });
  });
});
