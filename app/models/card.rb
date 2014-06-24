class Card < ActiveRecord::Base

  belongs_to :board
  belongs_to :column

  validates :question, :board_id, presence: true
  validates :value, numericality: { only_integer: true }
end
