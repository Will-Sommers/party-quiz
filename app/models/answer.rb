class Answer < ActiveRecord::Base

  belongs_to :card

  validates :card_id, :solution, presence: true

end
